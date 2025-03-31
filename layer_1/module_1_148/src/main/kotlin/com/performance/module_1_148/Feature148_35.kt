package com.performance.module_1_148

class Feature148UseCase1(
    private val repository: Feature148Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
