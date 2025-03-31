package com.performance.module_2_206

class Feature206UseCase2(
    private val repository: Feature206Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
