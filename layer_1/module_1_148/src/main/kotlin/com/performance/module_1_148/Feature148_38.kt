package com.performance.module_1_148

class Feature148UseCase2(
    private val repository: Feature148Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
