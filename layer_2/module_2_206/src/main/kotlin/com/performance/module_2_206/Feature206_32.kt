package com.performance.module_2_206

class Feature206UseCase0(
    private val repository: Feature206Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
