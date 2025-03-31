package com.performance.module_3_69

class Feature69UseCase2(
    private val repository: Feature69Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
